package edu.qsp.restorent_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.qsp.restorent_management_system.model.SittingTable;

public interface  SittingTableRespository extends JpaRepository<SittingTable, Integer> {
    
}
