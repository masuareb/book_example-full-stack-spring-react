package dev.masuareb.fullstackapp;

import dev.masuareb.fullstackapp.domain.Car;
import dev.masuareb.fullstackapp.domain.CarRepository;
import dev.masuareb.fullstackapp.domain.Owner;
import dev.masuareb.fullstackapp.domain.OwnerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class CarRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CarRepository repository;

    @Autowired
    private OwnerRepository ownerRepository;

    @Test
    public void saveCar() {
        Owner owner = new Owner("FirstName", "LastName");
        entityManager.persistAndFlush(owner);

        Car car = new Car("Tesla", "Model X", "White", "ABC-1234", 2017, 86000, owner);
        entityManager.persistAndFlush(car);

        assertThat(car.getId()).isNotNull();
    }

    @Test
    public void deleteCars() {
        Owner owner = new Owner("FirstName", "LastName");
        entityManager.persistAndFlush(owner);
        entityManager.persistAndFlush(new Car("Tesla", "Model X", "White", "ABC-1234", 2017, 86000, owner));
        entityManager.persistAndFlush(new Car("Mini", "Cooper", "Yellow", "BWS-3007", 2015, 24500, owner));

        repository.deleteAll();
        assertThat(repository.findAll()).isEmpty();
    }
}
