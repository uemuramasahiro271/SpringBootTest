package com.example.demo.entity;

public class MeetingRoom {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column meeting_room.id
	 * @mbg.generated  Mon Aug 31 21:21:58 JST 2020
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column meeting_room.room_name
	 * @mbg.generated  Mon Aug 31 21:21:58 JST 2020
	 */
	private String roomName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column meeting_room.max
	 * @mbg.generated  Mon Aug 31 21:21:58 JST 2020
	 */
	private Integer max;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column meeting_room.id
	 * @return  the value of meeting_room.id
	 * @mbg.generated  Mon Aug 31 21:21:58 JST 2020
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column meeting_room.id
	 * @param id  the value for meeting_room.id
	 * @mbg.generated  Mon Aug 31 21:21:58 JST 2020
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column meeting_room.room_name
	 * @return  the value of meeting_room.room_name
	 * @mbg.generated  Mon Aug 31 21:21:58 JST 2020
	 */
	public String getRoomName() {
		return roomName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column meeting_room.room_name
	 * @param roomName  the value for meeting_room.room_name
	 * @mbg.generated  Mon Aug 31 21:21:58 JST 2020
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName == null ? null : roomName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column meeting_room.max
	 * @return  the value of meeting_room.max
	 * @mbg.generated  Mon Aug 31 21:21:58 JST 2020
	 */
	public Integer getMax() {
		return max;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column meeting_room.max
	 * @param max  the value for meeting_room.max
	 * @mbg.generated  Mon Aug 31 21:21:58 JST 2020
	 */
	public void setMax(Integer max) {
		this.max = max;
	}
}