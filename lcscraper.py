
def fetch_lcpage():
    urlFile = open('lcpage.txt','r')
    urlLines = urlFile.readlines()
    probLink = str(input("Enter the LC Problem URL: "))

    probItems = dict()
    probItems["Status:"] = "NONE\n"
    probItems["Problem Link:"] = probLink+'\n'
    qString = ""
    i = urlLines.index('Submissions\n')
    probItems['Problem:'] = urlLines[i+1]
    probItems['Difficulty:'] = urlLines[i+2] + '\n'
    i += 4
    while (urlLines[i]!='Accepted\n'):
        if urlLines[i]!='\n':
            qString += "  " + urlLines[i]
        i += 1
    probItems['Problem Question:'] = qString

    nameIndex = probItems['Problem:'].index(".")
    fnstring = probItems['Problem:'][nameIndex+2:].replace(" ","_").replace("\n","").lower() + ".java"
    lcFile = open(fnstring,"a")
    lcFile.write("import java.util.*;\n")
    lcFile.write("/**\n")
    lcFile.write("* Status: ")
    lcFile.write(probItems['Status:'])
    lcFile.write("* Problem Link: ")
    lcFile.write(probItems['Problem Link:'])
    lcFile.write("* Problem: ")
    lcFile.write(probItems['Problem:'])
    lcFile.write("* Difficulty: ")
    lcFile.write(probItems['Difficulty:'])
    lcFile.write("* Problem Question: \n")
    lcFile.write(probItems['Problem Question:'])
    lcFile.write("**/\n\n")
    lcFile.write("class Solution\n")
    lcFile.write("{\n")
    lcFile.write("    \n")
    lcFile.write("}\n\n")
    lcFile.write("/**\n")
    lcFile.write("Time: \n")
    lcFile.write("Space: \n")
    lcFile.write("**/")

    lcFile.close()

if __name__ == "__main__":
    fetch_lcpage()
