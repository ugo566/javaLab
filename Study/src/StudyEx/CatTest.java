package StudyEx;
/* CatTest Ŭ���� */
public class CatTest {
  public static void main(String[] args) {
    // Cat ��ü ����
    Cat c = new Cat();
    
    /* 1. ��ü�� �ʵ� ���� �����Ͻÿ�. */
    c.name = "�׷�";
    c.breeds = "�丣�þ�";
    c.age = 3;
    
    // Dog ��ü �ʵ尪 ���
    System.out.printf("�̸�: %s\n", c.name);
    System.out.printf("ǰ��: %s\n", c.breeds);
    System.out.printf("����: %s\n", c.age);
  }
}

/* Cat Ŭ���� */
class Cat {
  String name;   // �̸�
  String breeds; // ǰ��
  int age;       // ����

  void claw() {
    System.out.println("������!!");
  }
  
  void meow() {
    System.out.println("�߿�~");
  }
}
