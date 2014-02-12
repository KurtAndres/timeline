import java.util.*;


public class Timeline {
	// Create a hash map
	//TreeMap datastructure according to ocs.oracle.com/javase/6/docs/api/java/util/TreeMap.html
	//is a sorted hashmap essentially by key value that is comparable
	// we can store the start dates as the key and the events as the value so its sorted by start date
	
	TreeMap<String, Event> timelineEvents = new TreeMap<String, Event>(); 

	public Timeline(String name){
		timelineEvents = null;
	}

	//add timeline event
	public void addEvent(Event e){
		timelineEvents.put(e.getStartDate(), e);
	}

	//checks if start date and name are same, then removes event
	//NOTE, returns String to output to console depending on success or not
	public String removeEvent(Event e){
		if(timelineEvents.containsKey(e.getStartDate()) && e.getName()== timelineEvents.get(e.getStartDate()).getName()){
			timelineEvents.remove(e.getStartDate());
			return e.getName() + " successfuly removed."; 
		}else
			return "Event not found in timeline.";
	}

	public void display(){
		//need to implement this still
	}
	
	public void loadTimeline(){
		//need to implement this to take all the file info and load it into the timeline TreeMap 
	}
	
	public void saveTimeline(){
		//need to implement to save timeline as TreeMap to file.
	}

}