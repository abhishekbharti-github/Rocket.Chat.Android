package chat.rocket.android.main.presentation

import chat.rocket.android.authentication.server.presentation.VersionCheckView
import chat.rocket.android.core.behaviours.MessageView
import chat.rocket.android.main.uimodel.NavHeaderUiModel
import chat.rocket.android.server.domain.model.Account
import chat.rocket.common.model.UserStatus

interface MainView : MessageView, VersionCheckView {

    /**
     * Shows the current user status.
     *
     * @see [UserStatus]
     */
    fun showUserStatus(userStatus: UserStatus)

    /**
     * Setups the navigation header.
     *
     * @param uiModel The [NavHeaderUiModel].
     * @param accounts The list of accounts.
     */
    fun setupNavHeader(uiModel: NavHeaderUiModel, accounts: List<Account>)

    fun closeServerSelection()

    fun invalidateToken(token: String)
}