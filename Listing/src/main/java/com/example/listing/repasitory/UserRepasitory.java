package com.example.listing.repasitory;

import com.example.listing.model.Listing;
import com.example.listing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepasitory extends JpaRepository<User, Integer> {


}
