package kr.co.sboard.service;


import kr.co.sboard.entity.TermsEntity;
import kr.co.sboard.repository.TermsRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    private TermsRepository termsRepository;

    public TermsEntity findByTerms() {
        return termsRepository.findById(1).get();
    }

}

