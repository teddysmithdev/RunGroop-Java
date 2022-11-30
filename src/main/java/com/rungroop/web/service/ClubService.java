package com.rungroop.web.service;

import com.rungroop.web.dto.ClubDto;
import com.rungroop.web.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(ClubDto clubDto);
    ClubDto findClubById(Long clubId);
    void updateClub(ClubDto club);
    void delete(Long clubId);
    List<ClubDto> searchClubs(String query);
}
