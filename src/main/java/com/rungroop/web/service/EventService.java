package com.rungroop.web.service;

import com.rungroop.web.dto.EventDto;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
}
