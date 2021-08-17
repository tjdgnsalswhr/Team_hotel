package teamhotel;

import teamhotel.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired ReservationRepository reservationRepository;
    @Autowired CancellationRepository cancellationRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPaymentApproved_AcceptReserve(@Payload PaymentApproved paymentApproved){

        if(!paymentApproved.validate()) return;

        System.out.println("\n\n##### listener AcceptReserve : " + paymentApproved.toJson() + "\n\n");



        // Sample Logic //
        // Reservation reservation = new Reservation();
        // reservationRepository.save(reservation);
        // Cancellation cancellation = new Cancellation();
        // cancellationRepository.save(cancellation);

    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverOrderCancelled_CancelReserve(@Payload OrderCancelled orderCancelled){

        if(!orderCancelled.validate()) return;

        System.out.println("\n\n##### listener CancelReserve : " + orderCancelled.toJson() + "\n\n");



        // Sample Logic //
        // Reservation reservation = new Reservation();
        // reservationRepository.save(reservation);
        // Cancellation cancellation = new Cancellation();
        // cancellationRepository.save(cancellation);

    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}
