package algorithm.list;


/*
 * 단순 연결 리스트
 * Header	Node1		  Node2	     Node3  	Node.end
 * Next  -> Data|next - >Data|next ->Data|next->Data|next->null
 즉, 헤더가 가리키는 노드는 첫번째 노드가 되는 것이고, null을 가리키는 노드가 마지막 노드가 되는 것이다.
 *
 */

public class MyLinkedList {

	private Node header;
	private int size;
	
	public MyLinkedList() {
		
		header = new Node(null);
		size = 0;
	}
	   private class Node{
	        
	        private Object data;
	        private Node nextNode;
	        
	        Node(Object data){
	            
	            this.data = data;
	            this.nextNode = null;
	        }
	        
	    }
	   
	   public void addFirst(Object data){
	        
	        Node newNode = new Node(data);
	        newNode.nextNode = header.nextNode;
	        header.nextNode = newNode;
	        size++;
	        
	    }

	

	
	
}
