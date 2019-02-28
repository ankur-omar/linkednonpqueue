class employee {
    String name;
    int salary;

    public employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class Node {
    employee data;
    Node next;


    public employee getdata() {
        return data;
    }

    public void setdata(employee data) {
        this.data = data;
    }

    public Node getnext() {
        return next;
    }

    public void setnext(Node next) {
        this.next = next;
    }


}
class mylinked
{
    Node front;
    Node rear;
    public mylinked()
    {
        front = null;
        rear = null;
    }


    public boolean isempty() {
        if (front == null && rear == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(employee val) {
        Node n = new Node();
        n.setdata(val);
        if (isempty()) {
            front = rear = n;
        } else {
            rear.setnext(n);
            rear = n;
        }
    }
    public void dequeue() {
        if (front == null) {
            return;
        } else {
            front = front.getnext();
        }
    }
    public void display() {
        Node temp;
        temp = front;
        if (isempty()) {
            return;
        } else {


            while (temp != null) {
                System.out.println(temp.getdata());
                temp = temp.getnext();

            }
        }
    }



}
public class linkedqueue1
{
    public static void main(String[] args) {
        mylinked obj = new mylinked();
        employee e1 = new employee(" abc",1000);
        employee e2 = new employee(" bcd",2000);
        employee e3 = new employee(" rty",3000);
        obj.enqueue(e1);
        obj.enqueue(e2);
        obj.enqueue(e3);
        obj.display();
        obj.dequeue();
        obj.display();
    }
}
