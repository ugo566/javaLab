package StudyEx;

public class CatTest3 {
	  public static void main(String[] args) {
	    // �� ����� ��ü ����
	    Cat2 cat1 = new Cat2();
	    Cat2 cat2 = new Cat2();
	    
	    // ��ü �ʵ� �ʱ�ȭ
	    cat1.name = "�׷�";
	    cat2.name = "����";
	    
	    // �� ������� �߿�~
	    cat1.meow();
	    cat2.meow();
	    
	    // �� ������� ������!
	    cat1.claw();
	    cat2.claw();
	  }
	}

	/* ����� Ŭ���� */
	class Cat2 {
	  /* �ʵ�(����) ���� */
	  String name;    // �̸�
	  String breeds;  // ǰ��
	  int age;        // ����
	  
	  /* �޼ҵ�(����) ���� */
	  void meow() {
	    System.out.printf("[%s]�� �߿�~\n", name);
	  }
	  
	  void claw() {
	    /* 1. claw �޼ҵ带 �ϼ��Ͻÿ�. */
	    System.out.printf("[%s]��������! ����~\n", name);
	  }
	}
