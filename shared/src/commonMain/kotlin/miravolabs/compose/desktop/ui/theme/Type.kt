package miravolabs.compose.desktop.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import mycomposedesktop.shared.generated.resources.Res
import mycomposedesktop.shared.generated.resources.roboto_mono_bold
import mycomposedesktop.shared.generated.resources.roboto_mono_italic
import mycomposedesktop.shared.generated.resources.roboto_mono_regular
import mycomposedesktop.shared.generated.resources.roboto_mono_semibold
import org.jetbrains.compose.resources.Font

@Composable
fun getAppFontFamily(): FontFamily {
    return FontFamily(
        Font(Res.font.roboto_mono_regular, FontWeight.Normal, FontStyle.Normal),
        Font(Res.font.roboto_mono_italic, FontWeight.Normal, FontStyle.Italic),
        Font(Res.font.roboto_mono_semibold, FontWeight.SemiBold, FontStyle.Normal),
        Font(Res.font.roboto_mono_bold, FontWeight.Bold, FontStyle.Normal)
    )
}

val AppTypography: Typography
    @Composable
    get() {
        val monoFamily = getAppFontFamily()

        return Typography(
            // ==========================================
            // Display: Dashboard Metrics, Big Analytics Numbers
            // ==========================================
            displayLarge = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp,
                lineHeight = 44.sp,
                letterSpacing = (-0.5).sp
            ),
            displayMedium = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                lineHeight = 36.sp,
                letterSpacing = (-0.25).sp
            ),
            displaySmall = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp,
                lineHeight = 32.sp,
                letterSpacing = 0.sp
            ),

            // ==========================================
            // Headline: Window Titles, Module & Section Headers
            // ==========================================
            headlineLarge = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                lineHeight = 28.sp,
                letterSpacing = 0.sp
            ),
            headlineMedium = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.15.sp
            ),
            headlineSmall = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                lineHeight = 22.sp,
                letterSpacing = 0.15.sp
            ),

            // ==========================================
            // Title: Cards, Dialog Headers, Top Bars, Subsections
            // ==========================================
            titleLarge = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.1.sp
            ),
            titleMedium = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                lineHeight = 18.sp,
                letterSpacing = 0.15.sp
            ),
            titleSmall = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 13.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.1.sp
            ),

            // ==========================================
            // Body: Standard Desktop Content, Data Tables, Code/Logs
            // ==========================================
            bodyLarge = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.25.sp
            ),
            bodyMedium = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 13.sp,
                lineHeight = 18.sp,
                letterSpacing = 0.25.sp
            ),
            bodySmall = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.4.sp
            ),

            // ==========================================
            // Label: Buttons, Badges, Tabs, Table Headers, Tags
            // ==========================================
            labelLarge = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.SemiBold,
                fontSize = 13.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp
            ),
            labelMedium = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 14.sp,
                letterSpacing = 0.5.sp
            ),
            labelSmall = TextStyle(
                fontFamily = monoFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 11.sp,
                lineHeight = 14.sp,
                letterSpacing = 0.5.sp
            )
        )
    }