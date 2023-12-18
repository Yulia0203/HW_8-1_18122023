package ru.fsv67;

import java.util.Date;

import ru.fsv67.models.TableModel;
import ru.fsv67.presenters.BookingPresenter;
import ru.fsv67.presenters.Model;
import ru.fsv67.presenters.View;
import ru.fsv67.views.BookingView;

public class program {

    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 2, "Иван Иванов");

        view.changeReservationTable(1001, new Date(), 3, "Иван Иванов");

    }

}
