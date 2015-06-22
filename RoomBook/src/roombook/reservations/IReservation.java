package roombook.reservations;

import java.time.LocalDate;

import roombook.guests.Guest;
import roombook.rooms.IRoom;

public interface IReservation 
{
	Guest getGuest();
	void setGuest(Guest guest);
	LocalDate getCheckinDate();
	void setCheckinDate(LocalDate checkinDate);
	LocalDate getCheckoutDate();
	void setCheckoutDate(LocalDate checkoutDate);
	int getNumberOfGuests();
	void setNumberOfGuests(int numberOfGuests);
	double getPricePerNight();
	void setPricePerNight(double pricePerNight);
	int getNumberOfNights();
	void setNumberOfNights(int numberOfNights);
	IRoom getGuestRoom();
	void setGuestRoom(IRoom guestRoom);
	
}
