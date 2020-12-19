package javaStudy.whiteship.week4;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import org.kohsuke.github.PagedIterable;

public class GitHubTest {
	public static void main(String[] args) throws IOException {
		// 토큰을 이용한 연결
		String personalToken = "29b54aa548460d20e53034fd11fa17c20d4aeb7d";
		GitHub gitHub = new GitHubBuilder().withOAuthToken(personalToken).build();
		
		// 깃헙 레포지토리 연결
		GHRepository ghRepository = gitHub.getRepository("sejongdeveloper/GitHubApiTest");
		
		// <참여자, 각 이슈 횟수>
		Map<String, int[]> participantHashMap = new HashMap<>();
		
		// 이슈 1~18번 체크
		for(int issueNum=1; issueNum<=18; issueNum++) {
			// 이슈 불러오기
			GHIssue ghIssue = ghRepository.getIssue(issueNum);
			
			// 각각의 이슈 댓글리스트
			PagedIterable<GHIssueComment> ghIssueComments = ghIssue.listComments();
			for(GHIssueComment ghIssueComment : ghIssueComments) {
				// 해당 이슈의 댓글참가자 이름
				String participant = ghIssueComment.getUser().getName();
				
				/*
				 *  참가자 저장소에 참가자가 있는 경우 
				 *  해당 이슈번호 값 1추가 
				 *  참여율 계산이기 때문에 하나의 이슈당 최대 1개
				 */
				if(participantHashMap.containsKey(participant)) {
					int[] assignments = participantHashMap.get(participant);
					assignments[issueNum] = 1;
					
				/*
				 *  참가자 저장소에 참가자가 없는 경우 
				 *  참가자 추가  
				 *  해당 이슈번호 값 1추가
				 */
				} else {
					int[] assignments = new int[19]; 
					assignments[issueNum] = 1;
					participantHashMap.put(participant, assignments);
				}
			}
		}
		
		// 참여자 전체 정보 출력
		participantHashMap.forEach((key, value) -> {
			int sum = 0; // 참여자의 전체 이슈 참여횟수
			for(int num : value) {
				sum += num;
			}
			
			double result = Math.floor(sum/18.0 * 100 * 100) / 100;
			
			System.out.print("참여자명:" + key);
			System.out.println(", 참여율: " + result +"%");
		});
	}
}
