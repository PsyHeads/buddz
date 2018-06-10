package com.buddz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="school")
public class School {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "school_sequence")
    @SequenceGenerator(name = "school_sequence", sequenceName = "SCHOOL_SEQ")
    private Long id;
	
    @Column(name = "groupid")
    private Long groupId;
    
    @Column(name = "name")
    private String name;
    
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getGroupId() {
		return groupId;
	}


	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getBoard() {
		return board;
	}


	public void setBoard(String board) {
		this.board = board;
	}


	@Column(name = "city")
    private String city;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "type")
    private String type;
    
    @Column(name = "board")
    private String board;
    
    
//    @ManyToOne(fetch = FetchType.LAZY)
//        @JoinColumn(name = "team_id", nullable = false)
//        private Team team;
    public School() {
    }
}
