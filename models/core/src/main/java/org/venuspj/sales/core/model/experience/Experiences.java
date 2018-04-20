package org.venuspj.sales.core.model.experience;

import java.util.Collection;
import java.util.List;

import static org.venuspj.sales.utils.Lists2.newArrayList;

public class Experiences {

    List<Experience> list = newArrayList();

    Experiences() {

    }

    public <E extends Experience> Experiences(Collection<E> experiences) {
        list.addAll(experiences);

    }

}
