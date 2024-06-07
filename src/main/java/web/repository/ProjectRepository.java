package web.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.Model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Vous pouvez ajouter des méthodes supplémentaires si nécessaire pour des opérations spécifiques sur les projets
}
