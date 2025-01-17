package co.com.hyunsedaOrder.domain.entity;

/**
 * Estado de la orden: No Enviado. Recibe 1 producto gratis
 * @author Laura Sofia Botina Montero, Esteban Caicedo Muñoz Gomez, Adrian Fernando Delgado Serna, Felipe Armand Pino Sierra 
 */
public class NotSentState extends State {
    public NotSentState(Order account) {
        super(account);
    }

    public NotSentState(State source) {
        super(source);
    }

    public boolean shipment(double additionalProducts) {
        double productsQuantity = getContext().getProductsQuantity();
        getContext().setProductsQuantity(productsQuantity + Order.FREE_PRODUCTS_NOT_SENT);
        System.out.println("You will receive 1 free product due to your order status (Not Sent)");
        return super.shipment(additionalProducts);
    }
/*
	public boolean withdraw(double amount) {
		double balance = getContext().getBalance();
		if ((balance - amount) > Order.OVERDRAW_LIMIT) {
			super.withdraw(amount);
			return true;
		} else {
			System.out.println(Order.ERR_OVERDRAW_LIMIT_EXCEED);
			return false;
		}
	}

 */

    public State transitionState() {
        double productsQuantity = getContext().getProductsQuantity();
        if (productsQuantity <= 0) {
            getContext().setObjState(new NotSentState(this));
        } else {
            if (productsQuantity >= Order.MIN_PRODUCTSQUANTITY) {
                getContext().setObjState(new ReceivedState(this));
            }
        }
        return getContext().getObjState();
    }
}
