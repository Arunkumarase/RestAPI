package restuarant.services;

import restuarant.exceptions.UnauthorizedAccessException;
import restuarant.exceptions.UserNotFoundException;

public interface WaitListService {
    int addUserToWaitList(long userId) throws UserNotFoundException;

    int getWaitListPosition(long userId) throws UserNotFoundException;

    void updateWaitList(long adminUserId, int numberOfSpots) throws UserNotFoundException, UnauthorizedAccessException;
}
