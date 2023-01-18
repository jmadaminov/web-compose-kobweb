package org.example.smartposweb.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import org.example.smartposweb.Spacer
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Input
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Box(
        Modifier.fillMaxSize().minHeight(100.percent)
            // Create a box with two rows: the main content (fills as much space as it can) and the footer (which reserves
            // space at the bottom). "auto" means the use the height of the row. "1fr" means give the rest of the space to
            // that row. Since this box is set to *at least* 100%, the footer will always appear at least on the bottom but
            // can be pushed further down if the first row grows beyond the page.
            .gridTemplateRows("1fr auto")
    ) {
        Column(
            modifier = Modifier.fillMaxSize().textAlign(TextAlign.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image("logo.png")
            Spacer(10.px)
            Span(attrs = {
                style {
                    border(width = 0.5.px, LineStyle.Solid, Color("#D0D5DD"))
                    boxSizing("border-box")
                    paddingLeft(11.px)
                    paddingRight(11.px)
                    paddingTop(4.px)
                    paddingBottom(4.px)
                    borderRadius(2.px)
                    display(DisplayStyle.LegacyInlineFlex)
                }
            }) {
                Image(
                    "user.png",
                    modifier = Modifier.size(16.px)
                )
                Input(
                    InputType.Text,
                    attrs = {
                        onInput { e -> username = e.value }
                        style {
                            border(width = 0.px)
                            outline("none")
                        }
                    }
                )
            }
            Spacer(10.px)

            Span(attrs = {
                style {
                    border(width = 0.5.px, LineStyle.Solid, Color("#D0D5DD"))
                    boxSizing("border-box")
                    paddingLeft(11.px)
                    paddingRight(11.px)
                    paddingTop(4.px)
                    paddingBottom(4.px)
                    borderRadius(2.px)
                    display(DisplayStyle.LegacyInlineFlex)
                }
            }) {
                Image(
                    "padlock.png",
                    modifier = Modifier.size(16.px)
                )
                Input(
                    InputType.Text,
                    attrs = {
                        onInput { e -> username = e.value }
                        style {
                            border(width = 0.px)
                            outline("none")
                        }
                    }
                )
            }
            Spacer(10.px)
            Button() {
                Text("Sign In")
            }
        }
    }
}