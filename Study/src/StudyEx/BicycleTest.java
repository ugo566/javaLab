package StudyEx;

/* ���� Ŭ���� */
public class BicycleTest {
  public static void main(String[] args) {
    // ������ ��ü ����
    Bicycle b1 = new Bicycle();

    // ��ü �ʵ尪 �ʱ�ȭ
    b1.name = "�ε��� ������";
    b1.weight = 7.25;
    b1.price = 326000;

    // ��ü ���� ���
    System.out.printf("b1->{%s, %.2f, %d}\n", b1.name, b1.weight, b1.price);
    
    /* 1. �� ������ ��ü b2�� �����Ͻÿ�. */
    Bicycle b2 = new Bicycle();
    /* 2. b2 ��ü�� �ʵ带 �ʱ�ȭ�Ͻÿ�. */
    b2.name = "���������";
    b2.weight = 10.68;
    b2.price = 4290000;
    /* 3. b2 ��ü ������ ����Ͻÿ�. */
    System.out.println("b2 ->{" + b2.name + ", " + b2.weight + ", " +b2.price +"}");
  }
}

/* ������ Ŭ���� */
class Bicycle {
  /* �ʵ� */
  String name;    // �̸�
  double weight;  // ����
  int price;      // ����

  /* �޼ҵ� */
  void move() {
    System.out.println("�����Ÿ� Ÿ�� �̵��մϴ�.");
  }
  
  void horn() {
    System.out.println("��������! �������Կ�~");
  }
}