package com.rmpader.security.data.repository;

import com.rmpader.security.data.model.UserAuthentication;
import org.springframework.data.repository.CrudRepository;

/**
 * @author RMPader
 */
public interface UserAuthenticationRepository extends CrudRepository<UserAuthentication, String> {

}
