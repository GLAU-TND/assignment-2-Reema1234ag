/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("himanshi", 1);
        obj.insert("reema", 2);
        obj.insert("prachi", 3);
        obj.insert("mani", 4);
        obj.insert("sanchita", 5);
        obj.display();
    }
}
