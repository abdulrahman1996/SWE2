/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import freelaning.Task;
import java.util.List;
import java.util.Set;

/**
 *
 * @author moroclash
 */
public class StateTaskFilter implements Cariteria{

	private int state;
	
	public void stateTasksFilter(int state)
	{
	
	}
	
	
	
	/**
	 * 
	 * private iterator class
	 */
	
	private class BeIterator implements Iterator
	{

		@Override
		public Object next() {
			return null;
		}

		@Override
		public Object previous() {
			return null;
		}

		@Override
		public boolean hasNext() {
			return true;
		}

		@Override
		public int getSize() {
			return 1;
		}

		@Override
		public Object getIndx(int index) {
			return null;
		}

		@Override
		public List getAll() {
			return null;
		}

		@Override
		public List Clone() {
			return null;
		}

		@Override
		public boolean removeIndex(int Index) {
			return true;
		}
	}
	
	@Override
	public Iterator GetFilter(List<Task> tasks) {
		return null;
	}
}
