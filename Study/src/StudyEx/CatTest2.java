package StudyEx;

public class CatTest2 {
	  public static void main(String[] args) {
	    // ����� ��ü c1 ����
	    Cat1 cat1 = new Cat1();
	    Cat1 cat2 = new Cat1();
	    
	    // �޼ҵ� ȣ��
	    cat1.meow();
	    cat2.meow();
	    
	    /* 1. ������ �޼ҵ带 ȣ���Ͻÿ�. */
	    cat1.claw();
	    cat2.claw();
	  }
	}


	/* ����� Ŭ���� */
	class Cat1 {
	  /* �ʵ�(����) */
	  String name;    // �̸�
	  String breeds;  // ǰ��
	  int age;        // ����
	  
	  /* �޼ҵ�(����) */
	  void meow() {
	    System.out.println("�߿�~");
	  }
	  
	  void claw() {
	    /* 2. ������ �޼ҵ带 �ϼ��Ͻÿ�. */
	    System.out.println("�l����!! ����!");
	  }
	}
