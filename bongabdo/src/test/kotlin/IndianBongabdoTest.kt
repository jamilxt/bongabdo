import com.hellohasan.bongabdo.api.Bongabdo
import com.hellohasan.bongabdo.api.BongabdoMethod
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import java.util.Calendar

class IndianBongabdoTest {

    @ParameterizedTest
    @CsvSource(
        "2024, 3, 14, '১ বৈশাখ, ১৪৩১'",
        "2024, 4, 14, '৩১ বৈশাখ, ১৪৩১'",
        "2024, 4, 15, '১ জ্যৈষ্ঠ, ১৪৩১'",
        "2024, 5, 15, '৩২ জ্যৈষ্ঠ, ১৪৩১'",
        "2024, 5, 16, '১ আষাঢ়, ১৪৩১'",
        "2024, 6, 16, '৩১ আষাঢ়, ১৪৩১'",
        "2024, 6, 17, '১ শ্রাবণ, ১৪৩১'",
        "2024, 7, 16, '৩১ শ্রাবণ, ১৪৩১'",
        "2024, 7, 17, '১ ভাদ্র, ১৪৩১'",
        "2024, 8, 16, '৩১ ভাদ্র, ১৪৩১'",
        "2024, 8, 17, '১ আশ্বিন, ১৪৩১'",
        "2024, 9, 17, '৩১ আশ্বিন, ১৪৩১'",
        "2024, 9, 18, '১ কার্তিক, ১৪৩১'",
        "2024, 10, 16, '৩০ কার্তিক, ১৪৩১'",
        "2024, 10, 17, '১ অগ্রহায়ণ, ১৪৩১'",
        "2024, 11, 15, '২৯ অগ্রহায়ণ, ১৪৩১'",
        "2024, 11, 16, '১ পৌষ, ১৪৩১'",
        "2025, 0, 14, '৩০ পৌষ, ১৪৩১'",
        "2025, 0, 15, '১ মাঘ, ১৪৩১'",
        "2025, 1, 12, '২৯ মাঘ, ১৪৩১'",
        "2025, 1, 13, '১ ফাল্গুন, ১৪৩১'",
        "2025, 2, 14, '৩০ ফাল্গুন, ১৪৩১'",
        "2025, 2, 15, '১ চৈত্র, ১৪৩১'",
        "2025, 3, 14, '৩১ চৈত্র, ১৪৩১'",
    )
    fun testBongabdo_Year_1431(year: Int, month: Int, day: Int, expectedDate: String) {
        assertBongabdoDate(year, month, day, expectedDate)
    }

    @ParameterizedTest
    @CsvSource(
        "2029, 3, 15, '১ বৈশাখ, ১৪৩৬'",
        "2029, 4, 15, '৩১ বৈশাখ, ১৪৩৬'",
        "2029, 4, 16, '১ জ্যৈষ্ঠ, ১৪৩৬'",
        "2029, 5, 15, '৩১ জ্যৈষ্ঠ, ১৪৩৬'",
        "2029, 5, 16, '১ আষাঢ়, ১৪৩৬'",
        "2029, 6, 16, '৩১ আষাঢ়, ১৪৩৬'",
        "2029, 6, 17, '১ শ্রাবণ, ১৪৩৬'",
        "2029, 7, 17, '৩২ শ্রাবণ, ১৪৩৬'",
        "2029, 7, 18, '১ ভাদ্র, ১৪৩৬'",
        "2029, 8, 17, '৩১ ভাদ্র, ১৪৩৬'",
        "2029, 8, 18, '১ আশ্বিন, ১৪৩৬'",
        "2029, 9, 17, '৩০ আশ্বিন, ১৪৩৬'",
        "2029, 9, 18, '১ কার্তিক, ১৪৩৬'",
        "2029, 10, 16, '৩০ কার্তিক, ১৪৩৬'",
        "2029, 10, 17, '১ অগ্রহায়ণ, ১৪৩৬'",
        "2029, 11, 16, '৩০ অগ্রহায়ণ, ১৪৩৬'",
        "2029, 11, 17, '১ পৌষ, ১৪৩৬'",
        "2030, 0, 14, '২৯ পৌষ, ১৪৩৬'",
        "2030, 0, 15, '১ মাঘ, ১৪৩৬'",
        "2030, 1, 13, '৩০ মাঘ, ১৪৩৬'",
        "2030, 1, 14, '১ ফাল্গুন, ১৪৩৬'",
        "2030, 2, 15, '৩০ ফাল্গুন, ১৪৩৬'",
        "2030, 2, 16, '১ চৈত্র, ১৪৩৬'",
        "2030, 3, 14, '৩০ চৈত্র, ১৪৩৬'",
    )
    fun testBongabdo_Year_1436(year: Int, month: Int, day: Int, expectedDate: String) {
        assertBongabdoDate(year, month, day, expectedDate)
    }

    private fun assertBongabdoDate(year: Int, month: Int, day: Int, expectedDate: String) {
        val bongabdo: Bongabdo = Bongabdo.getInstance(BongabdoMethod.INDIA)
        val calendar: Calendar = Calendar.getInstance()

        calendar.set(year, month, day)
        Assertions.assertEquals(expectedDate, bongabdo.getBongabdoData(calendar).getFullDate())
    }
}