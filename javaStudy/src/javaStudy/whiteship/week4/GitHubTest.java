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
		// ��ū�� �̿��� ����
		String personalToken = "29b54aa548460d20e53034fd11fa17c20d4aeb7d";
		GitHub gitHub = new GitHubBuilder().withOAuthToken(personalToken).build();
		
		// ���� �������丮 ����
		GHRepository ghRepository = gitHub.getRepository("sejongdeveloper/GitHubApiTest");
		
		// <������, �� �̽� Ƚ��>
		Map<String, int[]> participantHashMap = new HashMap<>();
		
		// �̽� 1~18�� üũ
		for(int issueNum=1; issueNum<=18; issueNum++) {
			// �̽� �ҷ�����
			GHIssue ghIssue = ghRepository.getIssue(issueNum);
			
			// ������ �̽� ��۸���Ʈ
			PagedIterable<GHIssueComment> ghIssueComments = ghIssue.listComments();
			for(GHIssueComment ghIssueComment : ghIssueComments) {
				// �ش� �̽��� ��������� �̸�
				String participant = ghIssueComment.getUser().getName();
				
				/*
				 *  ������ ����ҿ� �����ڰ� �ִ� ��� 
				 *  �ش� �̽���ȣ �� 1�߰� 
				 *  ������ ����̱� ������ �ϳ��� �̽��� �ִ� 1��
				 */
				if(participantHashMap.containsKey(participant)) {
					int[] assignments = participantHashMap.get(participant);
					assignments[issueNum] = 1;
					
				/*
				 *  ������ ����ҿ� �����ڰ� ���� ��� 
				 *  ������ �߰�  
				 *  �ش� �̽���ȣ �� 1�߰�
				 */
				} else {
					int[] assignments = new int[19]; 
					assignments[issueNum] = 1;
					participantHashMap.put(participant, assignments);
				}
			}
		}
		
		// ������ ��ü ���� ���
		participantHashMap.forEach((key, value) -> {
			int sum = 0; // �������� ��ü �̽� ����Ƚ��
			for(int num : value) {
				sum += num;
			}
			
			double result = Math.floor(sum/18.0 * 100 * 100) / 100;
			
			System.out.print("�����ڸ�:" + key);
			System.out.println(", ������: " + result +"%");
		});
	}
}
