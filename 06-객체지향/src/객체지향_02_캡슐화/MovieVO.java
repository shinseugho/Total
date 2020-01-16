package ��ü����_02_ĸ��ȭ;
/* ~VO : �������� Ŭ���� => ĸ��ȭ
 *            ���� : �б�/���� => �޼ҵ�ȭ ó��
 *            
 * �����ʱ�ȭ 1) ������             ] �������� 
 *         2) �ʱ�ȭ���       ]  
 *         ============ 
 *         3) setter     ] �ѹ��� ����
 *         
 *         class A
 *         {
 *              int a; 
 *              for(int i=0;i<10;i++
 *              {
 *                 a=1; 
 *              }
 *         }
 *         => ���� : class�ȿ����� for���� �������� ���Ѵ�. ����(int a=10;)�� �����ϴ�.
 *         
 *          class A
 *         {
 *              static int a=10; 
 *              static 
 *              {
 *                for(int i=0;i<10;i++)
 *                    {
 *                         a=1; 
 *                    }
 *              }
 *         }
 *         => A = 9 �� ����Ѵ�. (�ʱ�ȭ��� A(){}�� �����Ѵ�.)(static�� ������ {}�� ���� ������ȴ�.)    
 *         
 *   �ʱⰪ�� ���� �а�, Instance���(�ʱ�ȭ���)�� ã�� ���������� �����ڸ� ã�� �����ڸ� ����ϱ⿡ �ʱ�ȭ��ϰ� ������ �� ������ �ؼ� ����ϴ� ���� ����.
 *   static�� static{}�� ���� ���� ���ϰ�, instance����� �����ڸ� ����ϴ°� ���ϴ�. �ֳ��ϸ� static�� �ڵ������̱⶧���̴�.
 */

/* ��λ� (2019)
 * ����6.7/10
 * ���/�׼�
 * �ѱ�
 * 2019.12.19 ����
 * 128��, 12���̻������
 * (����) ������, �躴��
 * (�ֿ�) �̺���, ������, ������, ������, ����
 * ��������6,789,642��
 * ���ѹα� ���� ����� �ִ� �Ը��� ��λ� ���� �߻�.
 * ���۽����� �糭�� �ѹݵ��� ���İ��� �ƺ��ȯ�� �ǰ�,
 * ���� �� ��θ� �����ų �߰� ������ �����ȴ�.
 */

public class MovieVO {
	
	private String title;
	private double score;
	private String genre;
	private String redate;
	private int time;
	private String grade;
	private String director;
	private String actor;
	private int showUser;
	private String story;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRedate() {
		return redate;
	}
	public void setRedate(String redate) {
		this.redate = redate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getShowUser() {
		return showUser;
	}
	public void setShowUser(int showUser) {
		this.showUser = showUser;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
}
