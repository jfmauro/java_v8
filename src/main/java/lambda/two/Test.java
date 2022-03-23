package lambda.two;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {


        Activity activity1 = new Activity(1L, "biking");
        Activity activity2 = new Activity(1L, "chess");
        Activity activity3 = new Activity(1L, "swimming");

        List<Activity> activityP1 = new ArrayList<>();
        activityP1.add(activity1);

        List<Activity> activityP2 = new ArrayList<>();
        activityP2.add(activity1);
        activityP2.add(activity2);
        activityP2.add(activity3);

        Person p1 = new Person(1L, "doe");
        p1.setActivities(activityP1);

        Person p2 = new Person(2L, "moe");
        p2.setActivities(activityP2);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);


        List<List<Activity>> activitiesOne = persons.stream()
                .map(p -> p.getActivities())
                .collect(Collectors.toList());


        List<Activity> activitiesTwo = persons.stream()
                .map(p -> p.getActivities())
                .flatMap(lact -> lact.stream())
                .collect(Collectors.toList());

        List<Activity> activitiesThree = persons.stream()
                .map(p -> p.getActivities())
                .flatMap(lact -> lact.stream())
                .filter(a -> a.getName().startsWith("c"))
                .collect(Collectors.toList());


        final List<String> activitiesFour = persons.stream()
                .map(p -> p.getActivities())
                .flatMap(activities1 -> activities1.stream())
                .map(activity -> activity.getName())
                .filter(name -> name.startsWith("b"))
                .collect(Collectors.toList());


    }

}
