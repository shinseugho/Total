package ��ü����_01_������;
/*   1. �������� �ʱ�ȭ
 *      1) ������     : �ʱ�ȭ�� �ѹ��� �����ϴ�.
 *      2) setter : ���ϴ� ������ �ʱ�ȭ�� �����ϴ�.
 */

//ĸ��ȭ
class Music {
	private int mno;
	private String title;
	private String singer;
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Music music = new Music();
		
		//����
		music.setMno(100);
		music.setTitle("���� ���� ���ο���");
		music.setSinger("�ٺ�ġ");
		
		//�б�
		System.out.println(music.getMno());
		System.out.println(music.getTitle());
		System.out.println(music.getSinger());
	}

}
