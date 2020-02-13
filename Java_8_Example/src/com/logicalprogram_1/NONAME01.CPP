
 #include <stdio.h>
 #include <string.h>
 #include <alloc.h>

int main(void)
 {
    char *string1 = "sathya";
    char *string2 = "tech";
    int length;

    length = strcspn(string1, string2);
    printf("Character where strings intersect is at position %d\n",
	   length);

    return 0;
 }

