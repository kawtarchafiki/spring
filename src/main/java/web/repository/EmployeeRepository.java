package web.repository;



import web.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Vous n'avez pas besoin de définir les méthodes CRUD ici,
    // elles sont fournies par JpaRepository
}
