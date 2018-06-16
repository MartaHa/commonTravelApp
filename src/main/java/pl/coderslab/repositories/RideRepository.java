package pl.coderslab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.entity.Ride;
import pl.coderslab.entity.User;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {

    @Query(value = "SELECT * FROM ride WHERE user_id = ?1", nativeQuery = true)
    List <Ride> findAllRidesByUserId(long id);

    @Query(value = "SELECT * FROM ride WHERE placeb = ?1", nativeQuery = true)
    List <Ride> findbyDestination(String placeb);

    @Query(value = "SELECT * FROM ride WHERE placea = ?1", nativeQuery = true)
    List <Ride> findbyStart(String placea);

    @Query(value = "SELECT * FROM ride WHERE date = ?1", nativeQuery = true)
    List <Ride> findbyDate(String date);
}




