package quiz.nestedclasses.question13;

import org.springframework.http.converter.json.GsonBuilderUtils;

class ABC
{
    int i = 10101;

    {
        i--;
    }

    public ABC()
    {
        --i;
    }

    class XYZ
    {

        int i = this.i;

        {
            i++;
        }

        public XYZ()
        {
            ++i;
        }
    }
}
