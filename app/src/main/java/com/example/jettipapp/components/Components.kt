package com.example.jettipapp.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.Refresh
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.internal.enableLiveLiterals
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputField(
    modifier: Modifier = Modifier,
    valueState: MutableState<String>,
    labelId: String,
    enable: Boolean,
    isSingleLine: Boolean,
    keyboardType: KeyboardType = KeyboardType.Number,
    imeAction: ImeAction = ImeAction.Next,
    onAction: KeyboardActions = KeyboardActions.Default
) {
   OutlinedTextField(
       value = valueState.value,
       onValueChange = {valueState.value = it},
       label = { Text(text = labelId)},
       leadingIcon = { Icon(imageVector = Icons.Rounded.AttachMoney, contentDescription = "Money Icon")},
       singleLine = isSingleLine,
       enabled = enable,
       modifier = modifier,
       textStyle = TextStyle(fontSize = 18.sp, color = MaterialTheme.colorScheme.onBackground),
       keyboardOptions = KeyboardOptions(keyboardType = keyboardType, imeAction = imeAction),
       keyboardActions = onAction
       )








}

