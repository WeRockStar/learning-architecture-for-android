package beepbeep.learning_mvvm.login

import io.reactivex.Observable

interface MvpContract {
    interface Input {
        val name: Observable<String>
        val favoriteAnimal: Observable<String>
        val buttonEvent: Observable<Unit>
    }

    interface Output {
        val outputViewModel: Observable<LoginViewModel>
    }
}