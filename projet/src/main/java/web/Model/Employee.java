package web.Model;



import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="employe")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Post post; // Utilisation de l'énumération Post pour représenter le poste de l'employé
    private List<String> skills; // Liste de compétences en tant que chaînes de caractères

    // Constructeurs, getters et setters
}

