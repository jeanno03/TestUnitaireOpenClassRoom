package entities;

import methods.MyList;

public class MyListImpl <T extends Comparable<T>> implements MyList<T>{
	
	private Elem start;
	private Elem current;
	private int size;

	public MyListImpl() {
		super();
		start = null;
		current = start;
		size = -1;
	}

	@Override
	public void add(T e) {
		Elem newElem = new Elem(e, null);
		if(start == null) {
			start = newElem;
			current = start;
		} else {
			current.setNext(newElem);
			current = newElem;
		}
		size++;
	}

	@Override
	public T removeAt(int pos) {
		if(pos>size) {
			throw new ArrayIndexOutOfBoundsException("La taille est " + size + "l'élément " + pos + "n'existe donc pas");
		}
		Elem previous = start;
		Elem toRemove = previous;
		if(pos ==0) {
			toRemove = start;
			start.setNext(start.getNext());
		}else {
			while(pos-->1)
				previous = previous.getNext();
			toRemove = previous.getNext();
			previous.setNext(toRemove.getNext());
		}
		size--;
		return toRemove.getContent();
	}

	@Override
	public T removeItem(T item) {
		Elem previous = null;
		Elem toRemove = start;
		boolean found = false;
		if(start != null && start.getContent().equals(item)) {
			found = true;
			toRemove = start;
			start.setNext(start.getNext());
			size--;
		}
		else {
			while(!found && toRemove != null) {
				previous = toRemove;
				toRemove = toRemove.getNext();
				if(toRemove.getContent().equals(item)) {
					found = true;
				}
			}
			previous.setNext(toRemove.getNext());
			size--;
		}
		return (toRemove == null) ? null :toRemove.getContent();
	}

	@Override
	public void setAt(T item, int pos) {
		if(pos > size) {
			throw new ArrayIndexOutOfBoundsException("La taille est " + size + "l'element " + pos + "n'existe donc pas");
		}
		Elem current = start;
		while(pos-- > 0) current = current.getNext();
		current.setContent(item);

	}

	@Override
	public T getAt(int pos) {
		if(pos > size) {
			throw new ArrayIndexOutOfBoundsException("La taille est " + size + "l'element " + pos + "n'existe donc pas");
		}
		Elem current = start;
		while(pos-- > 0) current = current.getNext();
		return current.getContent();
	}

	@Override
	public int getSize() {
		return size+1;
	}
	
	@Override
	public void reset() {
		size = -1;
		start  = null;
		current = start;
	}

	class Elem {
		private T content;
		private Elem next;

		public Elem() {
			super();
		}

		public Elem(T content, MyListImpl<T>.Elem next) {
			super();
			this.content = content;
			this.next = next;
		}

		public T getContent() {
			return content;
		}

		public void setContent(T content) {
			this.content = content;
		}

		public Elem getNext() {
			return next;
		}

		public void setNext(Elem next) {
			this.next = next;
		}


	}

}
