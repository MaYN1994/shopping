package cn.tedu.store.service.ex;

public class AddressLimitExceededException extends ServiceException {

	private static final long serialVersionUID = -4959002799264611132L;

	public AddressLimitExceededException() {
		super();
	}

	public AddressLimitExceededException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AddressLimitExceededException(String message, Throwable cause) {
		super(message, cause);
	}

	public AddressLimitExceededException(String message) {
		super(message);
	}

	public AddressLimitExceededException(Throwable cause) {
		super(cause);
	}

}
