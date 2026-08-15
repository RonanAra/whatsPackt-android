package com.packt.conversations.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ConversationsListScreen(
    onNewConversationClick: () -> Unit,
    onConversationClick: (String) -> Unit
) {
    Text("Conversations List")
}