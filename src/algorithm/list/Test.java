package algorithm.list;
/*
 * package algorithm.list;
 * 
 * public class Node {
 * 
 * int data; //노드안 데이터 Node next = null;//다음노드
 * 
 * Node(int d) { //노드생성시 값을 받아서 생성 this.data = d; }
 * 
 * void append(int d) { //클래스 안에 데이터 추가 Node end = new Node(d); //새로운값으로 노드를
 * 만들어라 Node n = this; //첫번째 노드선택 while(n.next != null) { //맨 마지막 노드 찾기 n =
 * n.next; } n.next = end; //마지막 노드 넥스트값에 새로 생성한 노드를 넣어주면 새로운애가 맨 마지막 노드가 됨
 * 
 * } void delete(int d) { //삭제 Node n = this; //제일처음노드 while(n.next != null) {
 * //마지막 노드가 아닐때까지 if(n.next.data == d) { //마지막 전노드에서 판단 n.next = n.next.next; }
 * else n = n.next; //삭제할 노드를 계속찾음
 * 
 * } }
 * 
 * void retrieve() { Node n = this; while(n.next != null) {
 * System.out.print(n.data+"->"); n = n.next; //다음노드로 이동 }
 * System.out.println(n.data); //마지막 데이터 출력 }
 * 
 * public static class SingleLinkedList { public static void main(String[] args)
 * { Node head = new Node(1); head.append(2); head.append(3); head.append(4);
 * head.retrieve(); head.delete(3); head.append(2); head.retrieve(); } }
 * 
 * }
 */