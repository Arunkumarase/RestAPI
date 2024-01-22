package restuarant.Dtos;

public class GetUserWaitListResponseDto {
    private int position;
    private ResponseStatus responseStatus;

    public int getPosition() {
        return position;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
