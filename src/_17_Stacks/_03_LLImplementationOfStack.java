package _17_Stacks;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyStack{
    Node head;
    int len;
    int peek() throws Exception{  // show first
        if(head == null){
            throw new Exception("Stack underflow error");
        }
        return head.val;
    }
    int pop() throws Exception{  // delete first
        if(head == null){
            if(head == null){
                throw new Exception("Stack underflow error");
            }
        }
        int x = head.val;
        head = head.next;
        len--;
        return x;
    }
    void push(int ele){
        Node temp = new Node(ele);
        if(len == 0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }
    int size(){
        return len;
    }
    void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class _03_LLImplementationOfStack {
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack();
//        st.pop();   // iss wajah se error wala throw exception aayega
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();  // 40 30 20 10          this is printed in different lines
        System.out.println(st.size());  // 4
        System.out.println(st.peek());  // 40
        st.push(69);  // this add 69 in the stack
        st.display();  // 69 40 30 20 10
        st.pop();  // this will remove 69
        st.display();  // 40 30 20 10
        System.out.println(st.size());  // 4
    }
}
