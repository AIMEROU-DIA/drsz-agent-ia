package sn.yaatout.gestioncourrier.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "historique_courier")
public class HistoriqueCourier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateEnvoi;
    private String description;
    private String etat;

    @ManyToOne
    private CourierDepart courierDepart;
    @ManyToOne
    private CourierArriver courierArriver;

    // Getters and Setters
}

package sn.yaatout.gestioncourrier.model;

import javax.persistence.*;

@Entity
@Table(name = "courier_arriver")
public class CourierArriver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateArrivee;
    private String numeroDeSuite;

    @ManyToOne
    private ReponseCourrier reponseCourrier;

    // Getters and Setters
}

package sn.yaatout.gestioncourrier.model;

import javax.persistence.*;

@Entity
@Table(name = "courier_depart")
public class CourierDepart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateDepart;

    @ManyToOne
    private ReponseCourrier reponseCourrier;

    // Getters and Setters
}