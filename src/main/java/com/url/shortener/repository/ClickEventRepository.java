package com.url.shortener.repository;

import com.url.shortener.models.ClickEvent;
import com.url.shortener.models.URLMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ClickEventRepository extends JpaRepository<ClickEvent,Long> {
    List<ClickEvent> findByUrlMappingAndClickDateBetween(URLMapping mapping,
                                                         LocalDateTime startDate, LocalDateTime endDate);

    List<ClickEvent> findByUrlMappingInAndClickDateBetween(List<URLMapping> UrlMappingList,
                                                         LocalDateTime startDate, LocalDateTime endDate);

}
