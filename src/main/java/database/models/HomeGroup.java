package database.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Ryan Alexander on 15/10/2018.
 */


/* create a class that represents prisoners table, containing all columns within that table
Use the rest of the slides to instruct you on how this should be done.
 */
// Named Queries
@Entity

public class HomeGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-generate
    private Long id;

    // Columns are normally all CAPS and this is not allowed in Java so @Column is used
    @Column(name = "schedule_id")
    private Integer scheduleId;

    @Column(name = "room_id")
    private Integer roomId;

    @Column(name = "date_start")
    private Date dateStart;

    @Column(name = "date_finish")
    private Date dateFinish;

    @Column(name = "course_id")
    private Integer courseId;





//    @ManyToMany
//    @JoinTable(
//            name = "payments",
//            joinColumns = {@JoinColumn(name = "course_id", nullable = false)},
//            inverseJoinColumns = {@JoinColumn(name = "schedule_id", nullable = false)}
//    )
//    private Set<LastMeal> course;
//
//    public payments() {
//    }



}
