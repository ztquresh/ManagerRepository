package main;

import org.springframework.data.repository.CrudRepository;


public interface ManagerRepository extends CrudRepository<ManagerEntity, Integer> {



    ManagerEntity findByFirstName(String firstName);
    ManagerEntity findByLastName(String lastName);
    ManagerEntity findByDepartment (String department);


}
