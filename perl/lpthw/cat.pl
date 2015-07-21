#!C:/Strawberry/perl/bin/perl.exe

use strict;
use warnings;

sub print_file
{
	my $file = shift;
	open FILE, $file || die "Unable to open $file";
	while (my $line = <FILE>)
	{
		print $line;
	}
}

sub print_dir
{
	my (@dirs) = @_;
	foreach my $dir (@dirs)
	{
		print "Calling print_file for $dir\n";
		&print_file($dir);
	}
}

sub cat
{
	while(my $file = shift)
	{
		if ( -d $file)
		{
			&print_dir(glob "$file/*");
		}
		else 
		{
			&print_file($file);
		}
	}
}

&cat(@ARGV);

