package pl.coderslab.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import pl.coderslab.entity.Ride;
import pl.coderslab.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RideRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private RideRepository rideRepository;


    @Test
    public void findAllRidesByUserId() {
        //given
//
//        User John = User.builder().firstName("John").lastName("Nowak").email("Lalala@gmail.com").phoneNumber("677777777").build();
//
//        List<Ride> rides = new ArrayList<>();
//        Ride a = Ride.builder().placeA("Vienna").placeB("Ankara").date("10.01.2011").time("12:00").freeSeats(4).build();
//        Ride b = Ride.builder().placeA("Toronto").placeB("Detroit").date("10.01.2011").time("12:00").freeSeats(4).build();
//        rides.add(a);
//        rides.add(b);
//        entityManager.persist(John);
//        John.setRides(rides);
//        entityManager.persist(John);
//
//        //when
//        List <Ride>result = rideRepository.findAllRidesByUserId(1);
//
//         //then
//        assertEquals(2, result.size());
    }
}