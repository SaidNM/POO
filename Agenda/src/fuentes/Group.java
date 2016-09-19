
package fuentes;

import java.util.ArrayList;


public class Group {
private ArrayList  <person>group;


public Group(){
group=new ArrayList<>();

}

public void agregar(person p){
group.add(p);

}

public ArrayList<person> getGroup() {
        return group;
    }

}
